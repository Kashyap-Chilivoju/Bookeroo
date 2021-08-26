import axios from "axios";
import {GET_ERRORS, SET_CURRENT_USER} from "./types";
import setJWTToken from "../securityUtils/setJWTToken";
import jwt_decode from "jwt-decode";


export const createNewUser = (newUser, history) => async dispatch => {
    console.log("createNewUser");
    try{
        const res = await axios.post("http://localhost:8080/api/users/register", newUser);
        history.push("/login");
        dispatch({
            type: GET_ERRORS,
            payload: {}
        });
    }
    catch (err){
        dispatch ({
            type: GET_ERRORS,
            payload: err.response.data
        });
    }
};

export const login = loginRequest => async dispatch => {
    try {
        //post => login request
        const res = await axios.post("http://localhost:8080/api/users/login", loginRequest)

        //extract token from res.data
        //access token value with 'res.data.token' May need sanitization.
        console.log(res.data.token);

        //set our token in the local storage

        // set our token in header 

        //decode the token on React

        // dispatch to our securityReducer

    }
    catch (err)
    {

    }

}
