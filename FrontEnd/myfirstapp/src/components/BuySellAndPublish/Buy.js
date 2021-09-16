import React, { Component } from 'react';

class Buy extends Component {
    render() {
        return (
            <div class="book-content book-wrap clearfix product-detail">
                <div class="container">
                    <div class ="row">
                        <div class="col-md-5 col-sm-12 col-xs-12">
                            <img class = "image-responsive" src="https://via.placeholder.com/700x400/FFB6C1/000000"></img>
                        </div>
                        
                        <div class="col-md-6 col-md-offset-1 col-sm-12 col-xs-12">
                            <h2 class="name">
                                Book name{"\n"}
                                <small>Book by HAHAHA</small>
                                <hr />
                                <i class="fa fa-star fa-1x text-primary"></i>
                                <i class="fa fa-star fa-1x text-primary"></i>
                                <i class="fa fa-star fa-1x text-primary"></i>
                                <i class="fa fa-star fa-1x text-primary"></i>
                                <i class="fa fa-star fa-1x text-muted"></i>
                                <span class="fa fa-1x"><small>(109) Votes</small></span>
                                <p><small><a href="javascript:void(0);">109 customer reviews</a></small></p>
                            </h2>

                            <hr />

                            <h3 class="price container">
                                $149.50
                                <small>*includes tax</small>
                            </h3>

                            <div class = "certified">
                                <ul>
                                    <li>
                                        Delivery Time: 3-5 business days
                                    </li>
                                    <li>
                                        Quality Assured
                                    </li>
                                </ul>

                            </div>

                            <hr />
                            <div class="description description-tabs">
                                <ul id="myTab" class="nav flex-column">
                                    <li><h5>Book Description</h5></li>
                                    <li><p>foffismndogkmgkdgmgsgdmddkgl;</p></li>
                                </ul>

                            <br />
                        </div>

                        <div class="row">
                            <div class="col-sm-12 col-md-6 col-lg-6">
                                <a href="/cart" class="btn btn-success btn-lg">Add to cart ($149.50)</a>
                            </div>
                        </div>
                    </div>
                </div>
                <hr />
            </div>
        </div>


            

        );
    }
}

export default Buy;