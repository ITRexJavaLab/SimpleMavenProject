package com.itrex.java.lab;

import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class MsgSimplifier {

    public static String simplify(String msg) {
        return StringUtils.normalizeSpace(msg.lines().collect(Collectors.joining(" ")));
    }

}
