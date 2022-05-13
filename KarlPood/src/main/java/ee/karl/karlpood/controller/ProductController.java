package ee.karl.karlpood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("tooted") //get-päring brauserist
    public String saaTooted(){
        return "Toode kätte saadud";
    }

    @GetMapping("tellimine")
    public String Tellimus(){
        return "Toode tellitud";
    }

    @GetMapping("prindi-logidesse")
    public String prindiLogidesse(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Logi nr " + i);
        }
        return "Logidesse edukalt prinditud";
    }

    @GetMapping("liida/{arv1}/{arv2}")
    public int liidaKokku(@PathVariable int arv1, @PathVariable int arv2){
        return arv1 + arv2;
    }

    List<String> s6nad = new ArrayList<>();
    @GetMapping("saa-sonad")
    public List<String> saaSonad(){
        return s6nad;
    }

    @GetMapping("lisa-sona/{sona}")
    public List<String> lisaSona(@PathVariable String sona){
        s6nad.add(sona);
        return s6nad;
    }

    @GetMapping("yks-sona/{index}")
    public String saaYksSona(@PathVariable int index){
        return s6nad.get(index);
    }

    @GetMapping("kustuta-sona/{index}")
    public String kustutaSona(@PathVariable int index){
        return s6nad.remove(index);
    }

    @GetMapping("sonade-arv")
    public int sonadeArv(){
        return s6nad.size();
    }

}
