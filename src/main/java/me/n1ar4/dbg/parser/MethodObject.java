/*
 * GPLv3 License
 *
 * Copyright (c) 2023-2025 4ra1n (Jar Analyzer Team)
 *
 * This project is distributed under the GPLv3 license.
 *
 * https://github.com/jar-analyzer/jar-analyzer/blob/master/LICENSE
 */

package me.n1ar4.dbg.parser;

import java.util.ArrayList;

public class MethodObject {
    private String className;
    private String methodName;
    private String methodDec;
    private ArrayList<OpcodeObject> opcodes;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodDec() {
        return methodDec;
    }

    public void setMethodDec(String methodDec) {
        this.methodDec = methodDec;
    }

    public ArrayList<OpcodeObject> getOpcodes() {
        return opcodes;
    }

    public void setOpcodes(ArrayList<OpcodeObject> opcodes) {
        this.opcodes = opcodes;
    }

    @Override
    public String toString() {
        return "MethodObject{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", methodDec='" + methodDec + '\'' +
                ", opcodes=" + opcodes +
                '}';
    }
}
