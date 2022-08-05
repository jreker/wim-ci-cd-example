package de.jreker.wim.calculator;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.jreker.wim.calculator.entity.Square;


@AutoConfigureMockMvc
@SpringBootTest
public class RestControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void preperateTests() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testSquareCalculatorEndpoint() throws Exception {
        Square square = new Square();
        square.setA(2);
        square.setB(2);
        square.setC(2);

        mockMvc.perform(post("/calc/square")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsBytes(square)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(8));
    }

    @Test
    public void testGetVersion() throws Exception {
        mockMvc.perform(get("/version"))
                .andExpect(status().isOk());
    }

    @Test
    public void testHelloWorld() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

}
