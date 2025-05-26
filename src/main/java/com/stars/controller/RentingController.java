package com.stars.controller;

import com.stars.model.Renting;
import com.stars.service.IRentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/renting")
@CrossOrigin(origins = "*")
public class RentingController {
    @Autowired
    private IRentingService rentingService;

    @GetMapping("/All")
    @CrossOrigin(origins = "*")
    public List<Renting> getAllRenting(){
        return rentingService.getAllRenting();
    }
    //添加数据
    @PostMapping("/Add")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> addRenting(@RequestBody Renting renting) {
        try {
            int result = rentingService.addRenting(renting);
            if (result > 0) {
                return ResponseEntity.ok("数据添加成功");
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("数据添加失败");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("请求参数错误: " + e.getMessage());
        }
    }
    @DeleteMapping("/delete/{rentingname}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> deleteRenting(@PathVariable("rentingname") String rentingname){
        if (rentingname == null || rentingname.trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("请求参数无效");
        }
        try{
            int result = rentingService.deleteRenting(rentingname);
            if(result>0){
                return ResponseEntity.ok("数据删除成功");
            }else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("数据不存在");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("请求参数错误: " + e.getMessage());
        }

    }
}