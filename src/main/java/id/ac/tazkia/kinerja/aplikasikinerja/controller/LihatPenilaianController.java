package id.ac.tazkia.kinerja.aplikasikinerja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LihatPenilaianController {

    @GetMapping("/lihatpenilaian/list")
    public void list(){}
}