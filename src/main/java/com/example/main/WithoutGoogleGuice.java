package com.example.main;

import com.example.request.SquareRequest;
import com.example.service.DrawShape;
import com.example.service.DrawSquare;

/**
 * @author vranjan
 * created 31/08/2021
 */
public class WithoutGoogleGuice {

    private static final String SQUARE_REQ = "SQUARE";

    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }

    private static void sendRequest(final String squareReq) {
        if(SQUARE_REQ.equalsIgnoreCase(squareReq)) {
            DrawShape drawShape = new DrawSquare();
            SquareRequest squareRequest = new SquareRequest(drawShape);
            squareRequest.makeRequest();
        }
    }
}
