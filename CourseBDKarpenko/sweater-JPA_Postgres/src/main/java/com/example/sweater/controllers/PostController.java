package com.example.sweater.controllers;

import com.example.sweater.domain.Post;
import com.example.sweater.repos.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Optional;

@Controller
public class PostController {
    @Autowired
    private PostRepo postRepo;


    @GetMapping("/post")
    public String main(Map<String, Object> model) {
        Iterable<Post> post = postRepo.findAll();
        model.put("post", post);
        return "post";
    }

    @GetMapping("/post/delete")
    public String deleteSale(@RequestParam("id") Integer postId) {
        postRepo.deleteById(postId);
        return "redirect:/post";
    }

    @GetMapping("/post/edit")
    public String editSale(@RequestParam("id") Integer postId, Map<String, Object> model) {
        Optional<Post> postOptional = postRepo.findById(postId);
        if (postOptional.isPresent()) {
            Post post = postOptional.get();
            model.put("post", post);
            return "edit-post";
        }
        return "redirect:/post";
    }

    @PostMapping("/post/update")
    public String updateSale(@ModelAttribute("post") Post post) {
        postRepo.save(post);
        return "redirect:/post";
    }

    @GetMapping("/post/create")
    public String createSupplierForm(Map<String, Object> model) {
        Post post = new Post(); // Создаем новый объект Suppliers
        model.put("post", post); // Передаем его в модель
        return "create-post"; // Возвращаем имя шаблона для отображения формы создания поставщика
    }

    @PostMapping("/post/save")
    public String saveSupplier(@ModelAttribute("post") Post post) {
        postRepo.save(post); // Сохраняем нового поставщика в базу данных
        return "redirect:/post"; // Перенаправляем на страницу со списком поставщиков
    }
}
