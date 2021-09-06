import React, { Component } from 'react';

class Sell extends Component {
    render() {
        return (
            <form>
                <div class="form-group">
                    <label for="bookTitle">Book Title</label>
                    <input type="text" class="form-control" id="bookTitle"></input>
                </div>

                <div class="form-group">
                    <label for="bookYear">Book Year</label>
                    <input type="text" class="form-control" id="bookYear"></input>
                </div>

                <div class="form-group">
                    <label for="bookGenre">Book Genre</label>
                    <input type="text" class="form-control" id="bookGenre"></input>
                </div>

                <div class="form-group">
                    <label for="isbn">ISBN</label>
                    <input type="text" class="form-control" id="isbn"></input>
                </div>

                <div class="form-group">
                    <label for="description">Description</label>
                    <textarea class="form-control" id="description" row="3"></textarea>
                </div>

                <button type="submit" class="btn btn-primary">Sell</button>

                
            </form>
        );
    }
}

export default Sell;