/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hasasami
 */
public class QueryBuilder {
    
    List<Matcher> stackMatchers;
    
    public QueryBuilder() {
        
        stackMatchers = new ArrayList();
    }
    
    public And build() {
        And andStack = new And(stackMatchers.toArray(new Matcher[stackMatchers.size()]));
        stackMatchers = new ArrayList();
        return andStack;
    }
    
    public QueryBuilder oneOf(Matcher... matchers) {
        stackMatchers.add(new Or(matchers));
        return this;
    }
    
    public QueryBuilder playsIn (String team) {
        stackMatchers.add(new PlaysIn(team));
        return this;
    }
    
    public QueryBuilder hasAtLeast (int value, String category) {
        stackMatchers.add(new HasAtLeast(value, category));
        return this;
    }
    
    public QueryBuilder hasFewerThan(int value, String category) {
        stackMatchers.add(new HasFewerThan(value, category));
        return this;
    }
    
    public QueryBuilder not(Matcher matcher) {
        stackMatchers.add(new Not(matcher));
        return this;
    }
}
