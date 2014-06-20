/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shell;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author kuzyaev_nikolay
 */
public class ChangeDirectoryTest {

    private static final String INITIAL_PATH = "C:\\Test\\ololo";
    private ChangeDirectory underTest;

    @Before
    public void setUp() {
        underTest = new ChangeDirectory(INITIAL_PATH);
    }

    @Test
    public void testCd() throws Exception {
        Assert.assertEquals(INITIAL_PATH, underTest.getCurrent().getAbsolutePath());
        underTest.cd("..");
        Assert.assertEquals("C:\\Test", underTest.getCurrent().getAbsolutePath());
        underTest.cd("ololo");
        Assert.assertEquals(INITIAL_PATH, underTest.getCurrent().getAbsolutePath());
        underTest.cd("d:\\");
        Assert.assertEquals("d:\\", underTest.getCurrent().getAbsolutePath());
    }

}
