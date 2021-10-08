package com.itrex.java.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MsgSimplifierTest {

    @Test
    public void simplify() {
        //given
        String source = "text\nanother text";

        //when
        String result = MsgSimplifier.simplify(source);

        //then
        assertEquals("text another text", result);
    }

}