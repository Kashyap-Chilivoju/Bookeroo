import React, { Component } from 'react';

class OrderConfirm extends Component {
    render() {
        return (
            <div class="container mt-5 mb-5">
                <h2>Your Items</h2>

                <hr />
                    <h5>Delivery Address</h5>
                        <div class="container mt-5 mb-5">
                            <form class = "form-inline">
                                <p class="form-control mr-sm-2">123 Fake Street, Springfield, Illinois</p>
                                <p>Change</p>
                            </form>
                            <p>Add Delivery Instructions</p>
                        </div>

                <hr />

                    <h5>Payment Method</h5>
                        <div class="container mt-5 mb-5">
                            <form class = "form-inline">
                                <p class="form-control mr-sm-2">Pay With Paypal</p>
                                <p>Change</p>
                            </form>

                            <form class = "form-inline">
                                <input class="form-control mr-sm-2" type="text" placeholder="Enter Promotion Code"></input>
                                    <button class = "btn btn-outline-success my-2 my-sm-0" type="submit">Submit</button>
                            </form>

                        </div>

                <hr />

                <h5>Review Item and Delivery</h5>
                        <div class="container mt-5 mb-5">
                            <p>Details Here</p>
                        </div>

                <hr />

                <button class = "btn btn-outline-success my-2 my-sm-0" type="submit">Place Your Order</button>
                
            </div>

        );
    }
}

export default OrderConfirm;