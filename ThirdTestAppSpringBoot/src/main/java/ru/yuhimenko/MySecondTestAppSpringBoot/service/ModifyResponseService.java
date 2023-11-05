package ru.yuhimenko.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.yuhimenko.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
