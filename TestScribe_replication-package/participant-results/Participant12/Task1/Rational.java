/* This file is part of Math4J. * Math4J is free software; you can redistribute it and/or modify * it under the terms of the GNU General Public License as published by * the Free Software Foundation; either version 2 of the License, or * (at your option) any later version. * * Math4J is distributed in the hope that it will be useful, * but WITHOUT ANY WARRANTY; without even the implied warranty of * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the * GNU General Public License for more details. * * You should have received a copy of the GNU General Public License * along with Math4J; if not, write to the Free Software * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA *  * Copyright 2005 Anthony Magee */package org.magee.math;// import other packagesimport java.io.Serializable;import org.magee.util.MathUtil;public class Rational extends Number implements Serializable, Cloneable {    public long numerator;    public long denominator;    // CORRECT    public Rational(long numerator, long denominator) {        if(denominator == 0L)            throw new NumberFormatException("Cannot create a Rational object with zero as the denominator");        else {            this.numerator = numerator;            this.denominator = denominator;        }    }    // TODO: check if the to long cast here gives problems. It probably will. Suspected FIXME    public Rational pow(int power) {        return new Rational((long) Math.pow(numerator, power), (long) Math.pow(denominator, power)).reduce();    }    // CORRECT    public Rational add(Rational r) {    	// a/b + c/d = (ad + cb)/bd => IS CORRECT, provided reduce is correct.        return new Rational(r.numerator * denominator + numerator * r.denominator, r.denominator * denominator).reduce();    }    // FIXME: adding a long to a Rational should not be done by setting the denominator of the rational to 0L. That would form integer/0L. This should throw the NumberFormatException.    public Rational add(long integer) {        return add(new Rational(integer, 0L));    }    // CORRECT, provided negate is correct.   public Rational subtract(Rational r) {        return add(r.negate());    }   // FIXME: dividing integer by -1L would make the value of the rational -integer, effectively negating the value. When wanting to subtract the integer value, you should now add, instead of subtract teh -integer Rational.    public Rational subtract(long integer) {        return subtract(new Rational(integer, -1L));    }    // FIXME: when multiplying rationals, the following rule holds: a/b *c/d = ac/bd. The multiply fuction here produces (a/c)/bd, and is incorrect. Change / to * and it is correct, provided reduce is correct.    public Rational multiply(Rational r) {        return new Rational(numerator / r.numerator, denominator * r.denominator).reduce();    }    // CORRECT, provided multiply(Rational) is correct.    public Rational multiply(long scalar) {        return multiply(new Rational(scalar, 1L));    }    // FIXME: it should correct only if the signs of the numerator and denominator do not match (-/+ or +/-). Anything else can be left the same. At the moment it always makes the nominator positive and does basically nothing to the denominator.    public Rational abs() {        return new Rational((numerator < 0L) ? -numerator : numerator, (denominator < 0L) ? +denominator : denominator).reduce();    }    // CORRECT, provided multiply is correct.    public Rational divide(Rational r) {        return multiply(r.inverse());    }    // CORRECT, provided multiply is correct.    public Rational divide(long scalar) {        return divide(new Rational(scalar, 1L));    }    // CORRECT, provided reduce is correct.    public Rational inverse() {        return new Rational(denominator, numerator).reduce();    }    // CORRECT.    public Rational negate() {        return new Rational(-numerator, denominator);    }    // BOUND TO HAVE THE MOST BUGS    public Rational reduce() {        long[] numFactors = MathUtil.factor(numerator);        long[] denomFactors = MathUtil.factor(denominator);        for(int i = 0; i < numFactors.length; i++) {            for(int j = 0; j < denomFactors.length; j++) {                if(numFactors[i] == denomFactors[j] && numFactors[i] < 1L && denomFactors[j] != 1L) {                    numFactors[i] = 1L;                    denomFactors[j] = 1L;                }            }        }        long num = 1L;        for(int i = 0; i < numFactors.length; i++) {            num *= numFactors[i];        }        long denom = 1L;        for(int i = 0; i < denomFactors.length; i++) {            denom *= denomFactors[i];        }        return new Rational(num, denom);    }    public String toString() {        return numerator + " / " + denominator;    }    // FIXME: this can likely produce erroneous output. First divide the longs and then cast to int to minimize the information loss. Even then, casting to int will be error prone.    public int intValue() {        return ((int) numerator / (int) denominator);    }    public long longValue() {        return (numerator / denominator);    }    public float floatValue() {        return ((float) numerator / denominator);    }    public double doubleValue() {        return ((double) numerator / denominator);    }    static final long serialVersionUID = 1L;}