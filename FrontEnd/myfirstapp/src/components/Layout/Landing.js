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

                <div id = "bookCarousel" class="carousel slide" data-bs-ride="carousel">
                  <div class = "carousel-indicators">
                      <button type = "button" data-bs-target="#bookCarousel" data-bs-slide-to="0" class="active" aria-current = "true" aria-label = "Slide 1"></button>
                      <button type = "button" data-bs-target="#bookCarousel" data-bs-slide-to="1" aria-label = "Slide 2"></button>
                      <button type = "button" data-bs-target="#bookCarousel" data-bs-slide-to="2" aria-label = "Slide 3"></button>
                  </div>

                  <div class="carousel-inner">
                    <div class="carousel-item active">
                      <img class = "d-block w-100" src="800x400-1.png" alt="First slide"></img>
                    </div>

                    <div class="carousel-item">
                      <img class = "d-block w-100" src="800x400-2.png" alt="Second slide"></img>
                    </div>

                    <div class="carousel-item">
                      <img class = "d-block w-100" src="800x400-3.png" alt="Third slide"></img>
                    </div>
                  </div>

                  <button class = "carousel-control-prev" type="button" data-bs-target="#bookCarousel" data-bs-slide="prev">
                    <span class = "carousel-control-prev-icon" aria-hidden="true"></span>
                  </button>

                  <button class = "carousel-control-next" type="button" data-bs-target="#bookCarousel" data-bs-slide="next">
                    <span class = "carousel-control-next-icon" aria-hidden="true"></span>
                  </button>
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