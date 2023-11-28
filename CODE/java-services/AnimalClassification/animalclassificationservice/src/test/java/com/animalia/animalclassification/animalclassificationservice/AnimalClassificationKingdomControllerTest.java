package com.animalia.animalclassification.animalclassificationservice;

import com.animalia.animalclassification.animalclassificationservice.controller.AnimalClassificationKingdomController;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationKingdom;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationKingdomService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(AnimalClassificationKingdomController.class)
public class AnimalClassificationKingdomControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private AnimalClassificationKingdomService animalClassificationKingdomService;

    @InjectMocks
    private AnimalClassificationKingdomController animalClassificationKingdomController;

    @Test
    public void testGetAllAnimalClassificationKingdom() throws Exception {
        // Arrange
        AnimalClassificationKingdom kingdom1 = new AnimalClassificationKingdom();
        kingdom1.setId(1);
        kingdom1.setName("Animalia");

        AnimalClassificationKingdom kingdom2 = new AnimalClassificationKingdom();
        kingdom2.setId(2);
        kingdom2.setName("Plantae");

        List<AnimalClassificationKingdom> kingdoms = Arrays.asList(kingdom1, kingdom2);

        Mockito.when(animalClassificationKingdomService.getAllAnimalClassificationKingdom()).thenReturn(kingdoms);

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.get("/all"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Animalia"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name").value("Plantae"));
    }
}