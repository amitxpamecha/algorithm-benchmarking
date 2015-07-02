/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amitpamecha.algorithms;

import com.google.caliper.Benchmark;
import com.google.caliper.Param;

/**
 *
 * @author apamecha
 */
public class FactorialBenchmark {

    @Param({"5", "10", "20"})
    int number;

    @Benchmark
    long recursive(int reps) {
        int number=this.number; // to make reading number value mre efficient
        long dummy=0L;
        for (int i = 0; i < reps; i++) {
            dummy |= Factorial.recursive(number);//to avoid jVM to find dead code as we are not using its result
        }
        return dummy;
    }
    
     @Benchmark
    long iterative(int reps) {
        int number=this.number; // to make reading number value mre efficient
        long dummy=0L;
        for (int i = 0; i < reps; i++) {
            dummy |= Factorial.iterative(number);//to avoid jVM to find dead code as we are not using its result
        }
        return dummy;
    }
}
