package uz.pdp.task_2_2_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.task_2_2_2.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/attachment")
public class attachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/uploadphoto")
    public HttpEntity<?> addAttachment(MultipartHttpServletRequest request){
        String s = attachmentService.addAttachment(request);
        if (s == null){
            return ResponseEntity.status(409).body("attachment is empty");
        }
        return ResponseEntity.status(201).body("attachment saved");
    }

    @GetMapping("/downloadphoto/{id}")
    public void download(@PathVariable Integer id, HttpServletResponse response){
        attachmentService.getAttachment(id,response);
    }
}