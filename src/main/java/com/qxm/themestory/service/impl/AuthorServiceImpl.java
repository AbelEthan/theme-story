package com.qxm.themestory.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxm.themestory.dao.AuthorMapper;
import com.qxm.themestory.model.Author;
import com.qxm.themestory.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: {@link Author}
 * Description: 古代人物service实现
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2023/5/31 10:12
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {

  final AuthorMapper authorMapper;

  public AuthorServiceImpl(@Autowired AuthorMapper authorMapper) {
    this.authorMapper = authorMapper;
  }
}
