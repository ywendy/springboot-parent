package com.wendy.springboot.restfull.web;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * @author tony.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class UserControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
        generateUsers();

    }

    private void generateUsers() throws Exception {
        RequestBuilder requestBuilder;
        requestBuilder = MockMvcRequestBuilders.post("/users/")
                .param("id", "1")
                .param("userName", "tony")
                .param("age", "20");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("success")));
        requestBuilder = MockMvcRequestBuilders.post("/users/")
                .param("id", "2")
                .param("userName", "wendy")
                .param("age", "20");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("success")));
        requestBuilder = MockMvcRequestBuilders.post("/users/")
                .param("id", "3")
                .param("userName", "java")
                .param("age", "20");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("success")));
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void addUser() throws Exception {

        RequestBuilder requestBuilder;

        requestBuilder = MockMvcRequestBuilders.post("/users/")
                .param("id", "1")
                .param("userName", "tony")
                .param("age", "20");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("success")));
    }

    @Test
    public void getUserList() throws Exception {
        RequestBuilder requestBuilder;
        requestBuilder = MockMvcRequestBuilders.get("/users/");
        mockMvc.perform(requestBuilder).andExpect(status().isOk());
    }

    @Test
    public void getUser() throws Exception {
        RequestBuilder requestBuilder;
        requestBuilder = MockMvcRequestBuilders.get("/users/1");
        mockMvc.perform(requestBuilder).andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.userName", Matchers.is("tony")));
    }

    @Test
    public void deleteUser() throws Exception {
        RequestBuilder requestBuilder;
        requestBuilder = MockMvcRequestBuilders.delete("/users/1");
        mockMvc.perform(requestBuilder).andExpect(status().isOk());
    }


    @Test
    public void putUser() throws Exception {
        RequestBuilder requestBuilder;
        requestBuilder = MockMvcRequestBuilders.put("/users/1")
                .param("userName", "net")
                .param("age", "30");
        mockMvc.perform(requestBuilder).andExpect(status().isOk());
    }

}