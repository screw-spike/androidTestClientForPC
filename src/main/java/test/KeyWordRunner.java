package test;

import context.Context;
import fileutil.FileUtil;
import runner.RunKeyWord;
import runner.RunLoopStep;
import runner.RunStep;
import runner.Runner;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class KeyWordRunner {

    public static void main(String[] args) throws Exception {
        Runner.Runner("E:\\IdeaProjects\\AndroidRpcForPc\\src\\main\\resources\\case2.atm");
        System.out.println(Context.CONTEXTMAP);
    }
}