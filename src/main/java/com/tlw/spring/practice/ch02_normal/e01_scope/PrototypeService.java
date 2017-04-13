package com.tlw.spring.practice.ch02_normal.e01_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by 唐力伟 on 2017/4/7 21:38.
 */
@Service
@Scope("prototype")
public class PrototypeService {
}
