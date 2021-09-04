package com.example.request;

import com.example.service.DrawShape;

/**
 * @author vranjan
 * created 31/08/2021
 */
public class SquareRequest {

    private DrawShape drawShape;


    public SquareRequest(final DrawShape drawShape) {this.drawShape = drawShape;}

    public void makeRequest() {
        drawShape.drawSquare();
    }
}
