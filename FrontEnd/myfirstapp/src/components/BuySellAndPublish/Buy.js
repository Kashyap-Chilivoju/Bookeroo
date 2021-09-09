import React, { Component } from 'react';

class Buy extends Component {
    render() {
        return (
            <div class="container p-3 my-3 bg-dark text-white">  
                    <form>
                        <p class="text-center">
                            <div class="form-group">
                                <input type="file" class="form-control-file" id="bookCover"></input>
                            </div>
                            <div class="col-xs-4">
                                <label for="bookTitle">Book Title</label>
                                <input type="text" class="form-control" id="bookTitle"></input>
                            </div>

                            <div class="col-xs-4">
                                <label for="bookYear">Book Year</label>
                                <input type="text" class="form-control" id="bookYear"></input>
                            </div>

                            <div class="col-xs-4">
                                <label for="bookGenre">Book Genre</label>
                                <input type="text" class="form-control" id="bookGenre"></input>
                            </div>

                            <div class="col-xs-4">
                                <label for="isbn">ISBN</label>
                                <input type="text" class="form-control" id="isbn"></input>
                            </div>

                            <div class="col-xs-4">
                                <label for="description">Description</label>
                                <textarea class="form-control" id="description" row="3"></textarea>
                            </div>

                            <button type="submit" class="btn btn-primary">Buy</button>
                        </p>
                        
                    </form>
            </div>
        );
    }
}

export default Buy;