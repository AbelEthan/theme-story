package com.qxm.themestory;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.qxm.themestory.dao.PoetryMapper;
import com.qxm.themestory.model.Poetry;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: {@link PoetryTestApplication
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/5/31 10:39
 * @Describes
 */
@Slf4j
@SpringBootTest
public class PoetryTestApplication {

    final PoetryMapper poetryMapper;

    public PoetryTestApplication(@Autowired PoetryMapper poetryMapper) {
        this.poetryMapper = poetryMapper;
    }

    @Test
    public void loadingFiveDynasty() {
        String filepath = "D:\\project\\chinese-poetry\\五代的词\\data.json";
        String read = readWithFileInputStream(filepath);
        batchAddDao(read, "五代", "词");
    }

    @Test
    public void loadingYuan() {
        String filepath = "D:\\project\\chinese-poetry\\元曲\\data.json";
        String read = readWithFileInputStream(filepath);
        batchAddDao(read, "元", "曲");
    }

    @Test
    public void loadingTang() {
        for (int i = 3; i <= 5; i++) {
            String filepath = "D:\\project\\chinese-poetry\\唐诗\\data" + i + ".json";
            String read = readWithFileInputStream(filepath);
            batchAddDao(read, "唐", "诗");
        }
    }

    private void batchAddDao(String read, String dynasty, String tag) {
        JSONArray array = JSON.parseArray(read);
        List<Poetry> list = new ArrayList<>(array.size());
        final Poetry[] poetry = {null};
        array.stream().forEach(a -> {
            JSONObject jsonObject = JSON.parseObject(a.toString());
            poetry[0] = new Poetry();
            poetry[0].setTitle(jsonObject.getString("title"));
            poetry[0].setDynasty(dynasty);
            poetry[0].setTag(tag);
            poetry[0].setContent(jsonObject.getString("content"));
            poetry[0].setAuthor(jsonObject.getString("author"));
            poetry[0].setPrologue(jsonObject.getString("prologue"));
            list.add(poetry[0]);
        });
        poetryMapper.insertBatchColumn(list);
    }

    static String readWithFileInputStream(String filepath) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream input = new FileInputStream(filepath);
            byte[] buffer = new byte[1024];
            int length = 0;
            length = input.read(buffer);

            while (length != -1) {
                sb.append(new String(buffer, 0, length));
                length = input.read(buffer);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
