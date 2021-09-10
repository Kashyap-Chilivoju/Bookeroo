import React, { Component } from "react";
import { Link } from "react-router-dom";

class Landing extends Component {
  render() {
    return (
      <div className="landing">
        <div className="light-overlay landing-inner text-dark">
          <div className="container">
            <div className="row">
              <div className="col-md-12">

                <div id = "bookCarousel" class="carousel slide" data-ride="carousel">
                  <ol class = "carousel-indicators">
                      <li type = "button" data-target="#bookCarousel" data-slide-to="0" class="active"></li>
                      <li type = "button" data-target="#bookCarousel" data-slide-to="1"></li>
                      <li type = "button" data-target="#bookCarousel" data-slide-to="2"></li>
                  </ol>

                  <div class="carousel-inner">
                    <div class="carousel-item active">
                      <img class = "d-block w-100" src="800x400-1.png"></img>
                    </div>

                    <div class="carousel-item">
                      <img class = "d-block w-100" src="800x400-2.png"></img>
                    </div>

                    <div class="carousel-item">
                      <img class = "d-block w-100" src="800x400-3.png"></img>
                    </div>
                  </div>

                  <a class = "carousel-control-prev" role="button" href="#bookCarousel" data-slide="prev">
                    <span class = "carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                  </a>

                  <a class = "carousel-control-next" role="button" href="#bookCarousel" data-slide="next">
                    <span class = "carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                  </a>
                </div>

              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Landing;