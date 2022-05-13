package ee.karl.karlpood.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ListController {

    List<String> strings = new ArrayList<>(Arrays.asList("Snufkin", "Moomintroll", "Sniff"));

    @GetMapping("Products")
    public List<String> getString(){
        return strings;
    }

    @GetMapping("Products/{id}")
    public String getStrings(@PathVariable int id){
        return strings.get(id);
    }

    @DeleteMapping("Products/{id}")
    public String deleteString(@PathVariable int id){
        return strings.remove(id);
    }

    @DeleteMapping("Products")
    public String deleteStrings(){
        for (int i = 0; i < strings.size(); i++) {
            strings.clear();
        }
        return "Tooted kustutatud";
    }

    @PostMapping("Products")
    public void addString(@RequestBody String string){
        strings.add(string);
    }

    @PutMapping("Products/{id}")
    public void editString(@PathVariable int i, @RequestBody String string){
        strings.set(i, string);
    }
}
