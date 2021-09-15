import React, { Component } from 'react';

class Sell extends Component {
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
                                <label for="bookID">Book ID</label>
                                <input type="text" class="form-control" id="bookID"></input>
                            </div>

                            <div class="col-xs-4">
                                <label for="bookAuthor">Author</label>
                                <input type="text" class="form-control" id="bookAuthor"></input>
                            </div>

                            <div class="col-xs-4">
                                <label for="isbn13">ISBN-13</label>
                                <input type="text" class="form-control" id="isbn13"></input>
                            </div>

                            <div class="col-xs-4">
                                <label for="isbn10">ISBN-10</label>
                                <input type="text" class="form-control" id="isbn10"></input>
                            </div>

                            <div class="col-xs-4">
                                <label for="description">Description</label>
                                <textarea class="form-control" id="description" row="3"></textarea>
                            </div>

                            <button type="submit" class="btn btn-primary">Sell</button>
                        </p>
                        
                    </form>
            </div>
        );
    }
}

export default Sell;