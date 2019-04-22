package br.com.shortener;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import br.com.shortener.controller.UrlController;

public class UrlControllerTest extends ShortenerApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private UrlController urlController;

	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(urlController).build(); 
	}
	
	@Test
	public void testGETOriginalUrl() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/url/www.uol.com.br")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void testGETUrlStats() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/url/stats")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
