/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classB.Tugas.java.table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author DELL
 */
@Controller
public class tabletController {
   
    @RequestMapping("/tableku")
    public String getTable(Model Data){
        
    ArrayList<List<String>> data = new ArrayList <>();
        
        data.add(Arrays.asList("ID","Nomer KTP","Nama","jl.banteng"));
        data.add(Arrays.asList("123","12345671","iin","jl.burung"));
        data.add(Arrays.asList("124","12345672","udin","jl.burung"));
        data.add(Arrays.asList("125","12345673","dedo","jl.mangga"));
        data.add(Arrays.asList("126","12345674","baba","jl.mangga"));
        data.add(Arrays.asList("127","12345675","bubu","jl.rambutan"));
        data.add(Arrays.asList("128","12345676","asri","jl.mangga"));
        data.add(Arrays.asList("129","12345677","asru","jl.durian"));
        data.add(Arrays.asList("130","12345678","asre","jl.mangga"));
        data.add(Arrays.asList("131","12345679","iku","jl.monyet"));
        data.add(Arrays.asList("132","12345680","ika","jl.rambutan"));
        data.add(Arrays.asList("133","12345681","aki","jl.dragon"));
        data.add(Arrays.asList("134","12345682","puput","jl.buah"));
        data.add(Arrays.asList("135","12345683","epet","jl.binatang"));
        data.add(Arrays.asList("136","12345684","nunu","jl.burung"));
        data.add(Arrays.asList("137","12345685","sisi","jl.beban"));
        data.add(Arrays.asList("138","12345686","sasa","jl. beban"));
        data.add(Arrays.asList("139","12345687","sece","jl.menyulitkan"));
        data.add(Arrays.asList("140","12345688","cece","jl.susah"));
        data.add(Arrays.asList("141","12345689","bulan","jl.sulit"));
        data.add(Arrays.asList("142","12345690","cenep","jl.berdosa"));
        
        
        Data.addAttribute("table", data);
        
        
        return "table.viewer";
    }
}

