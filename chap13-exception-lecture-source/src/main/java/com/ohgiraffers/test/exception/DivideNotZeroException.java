package com.ohgiraffers.test.exception;

import com.ohgiraffers.test.Calculrator;

public class DivideNotZeroException extends Exception{
    public DivideNotZeroException(String massage){
        super(massage);
    }
}
