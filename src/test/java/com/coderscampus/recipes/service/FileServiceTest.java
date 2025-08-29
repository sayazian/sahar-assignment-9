package com.coderscampus.recipes.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileServiceTest {
//    @Test
//    public void parseR() throws IOException {
//        Reader r = new StringReader("""
//                Cooking Minutes, Dairy Free, Gluten Free, Instructions, Preparation Minutes, Price Per Serving, Ready In Minutes, Servings, Spoonacular Score, Title, Vegan, Vegetarian
//                10, true, true, "Pre and flaky, 10 to 13 minutes.", 5.0, 427.92, 15, 4, 99.0, "Roasted Santro", false, false
//                10, false, true, "Cut room temp pot, bring use.", 15.0, 128.28, 25, 8, 34.0, "Burrata, Frank Bonanno", false, true
//                65, false, false, "Preheat oven to 350° F. Butter a standard loaf pan or a 9\\" round or square baking pan.Melt the butter and allow to cool.Meanwhile trim off the zucchini ends and thinly slice 6 or 7 rounds off the end for garnish. Coarsely grate the rest on the large holes of a box grater. Add it to the middle of a clean kitchen towel and gently ring out some (you don't need to get it all out) of the water.Into a large bowl sift both flours, cornmeal, baking powder, salt, and baking soda together.Whisk the eggs and buttermilk into the cooled butter then stir in the zucchini then the cheese.Add the zucchini mixture to the flour mixture and stir until just combined - the batter will be thick.Transfer to the prepared pan and smooth out the top. Arrange the zucchini slices over top.Bake until golden and a tester inserted into center comes out clean, 55-65 minutes for a loaf pan 40 - 50 minutes for a round or square pan.", 25.0, 416.92, 90, 1, 99.0, "Cheddar Zucchini Cornbread", false, true
//                """);
//        String instr = new FileService().parseR(r);
//        assertEquals("Pre and flaky, 10 to 13 minutes.", instr);
//    }
//    @Test
//    public void parseR2() throws IOException {
//        Reader r = new StringReader("""
//                Cooking Minutes, Dairy Free, Gluten Free, Instructions, Preparation Minutes, Price Per Serving, Ready In Minutes, Servings, Spoonacular Score, Title, Vegan, Vegetarian
//                65, false, false, "Preheat oven to 350° F. Butter 9\\" round.", 25.0, 416.92, 90, 1, 99.0, "Cheddar Zucchini Cornbread", false, true
//                """);
//        String instr = new FileService().parseR(r);
//        assertEquals("Preheat oven to 350° F. Butter 9\" round.", instr);
//    }
}
