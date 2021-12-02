package gp.learn.awardservice.domain.vo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Program {

    private String program;


    private final List<String> VALID_PROGRAMS = Arrays.asList("OS","MS");

    private Logger logger = LoggerFactory.getLogger(Program.class);

    protected Program() {

    }
    public Program(String program){
        if(VALID_PROGRAMS.contains(program))
            this.setProgram(program);
        else
            logger.error(String.format("Invalid value : %s",program));
    }

    public String getProgram() {
        return program;
    }

    private void setProgram(String program) {
        this.program = program;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program that = (Program) o;
        return program.equals(that.program);
    }

    @Override
    public int hashCode() {
        return Objects.hash(program);
    }

    @Override
    public String toString() {
        return "Program{" +
                "program='" + program + '\'' +
                '}';
    }
}
