package com.tvd12.ezyfox.core.testing.requestlistenerclass;

import java.util.List;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import com.tvd12.ezyfox.core.annotation.RequestParam;
import com.tvd12.ezyfox.core.structure.RequestListenerClass;
import com.tvd12.test.base.BaseTest;

import lombok.Data;

public class RequestListenerClassTest extends BaseTest {

    @Test
    public void testValidCase() {
        RequestListenerClass clazz = new RequestListenerClass(ClassA.class);
        assertEquals(clazz.methodCount(), 5);
    }
    
    @Override
    public Class<?> getTestClass() {
        return RequestListenerClass.class;
    }
    
    @Data
    public static class ClassA {
        
        @RequestParam
        private int value1;
        
        @RequestParam
        private int value2;
        
        @RequestParam
        private ClassB classB;
        
        @RequestParam
        public void setDream(String dream) {
        }
        
        @RequestParam
        public void setWar(String war) {
        }
        
    }
    
    @Data
    public static class ClassB {
        @RequestParam
        private ClassA classA;
        
        @RequestParam
        public void setValues(List<Integer> values) {
            
        }
    }
    
}
