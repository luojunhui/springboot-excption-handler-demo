package cn.junhui.demo.controller;

import cn.junhui.demo.filter.RequestFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class ApiControllerTest {
    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    @Before
    public void initMokcMvc() {
        mvc = MockMvcBuilders.webAppContextSetup(context)
                .addFilter(new RequestFilter())
                .build();
    }

    @Test
    public void div() throws Exception {

        /*
        * 模拟正常参数post
        * */
        mvc.perform(MockMvcRequestBuilders.post("/api/div")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "\"a\":10,\n" +
                                "\"b\":5\n" +
                                "}")
        ).andExpect(status().isOk());

        /*
        * 模拟不合法参数post
        * */
        mvc.perform(MockMvcRequestBuilders.post("/api/div")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\"a\":10,\n" +
                        "\"b\":0\n" +
                        "}")
        ).andExpect(status().is5xxServerError());
    }

    @Test
    public void div1() throws Exception {
        /*
         * 模拟正常参数get
         * */
        mvc.perform(MockMvcRequestBuilders.get("/api/div1?a=10&b=5")).andExpect(status().isOk());

        /*
         * 模拟不合法参数get
         * */

        mvc.perform(MockMvcRequestBuilders.get("/api/div1?a=10&b=0")
        ).andExpect(status().is5xxServerError());
    }
}