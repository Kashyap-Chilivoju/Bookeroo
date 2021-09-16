import React, { Component } from 'react'

class Header extends Component {
    render() {
        return (
            <div>
            <nav className="navbar navbar-expand-sm navbar-dark bg-dark mb-4">
            <div className="container">
                <a className="navbar-brand" href="/Dashboard">
                    Bookeroo
                </a>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#mobile-nav">
                    <span className="navbar-toggler-icon" />
                </button>
    
                <div className="collapse navbar-collapse" id="mobile-nav">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item">
                            <a className="nav-link" href="/dashboard">
                                Dashboard
                            </a>
                        </li>
                    </ul>

                    <form class = "form-inline">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"></input>
                                <button class = "btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
    
                    <ul className="navbar-nav ml-auto">
                    <li className="nav-item">
                        <a className="nav-link" href="/login">
                            Login
                        </a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link " href="/register">
                            Register
                        </a>
                    </li>
                    <li className ="nav-item">
                        <a class="fa fa-shopping-cart" href="/cart"></a>
                    </li>
                    </ul>
                </div>
            </div>
        </nav>
            </div>
        )
    }
}
export default Header;