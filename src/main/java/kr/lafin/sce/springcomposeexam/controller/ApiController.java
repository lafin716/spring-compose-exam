package kr.lafin.sce.springcomposeexam.controller;

import kr.lafin.sce.springcomposeexam.model.Member;
import kr.lafin.sce.springcomposeexam.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ApiController {

    private final MemberRepository repository;

    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/members")
    public List<String> list() {
        var list = repository.findAll();
        return list.stream().map(Member::getName).collect(Collectors.toList());
    }
}
