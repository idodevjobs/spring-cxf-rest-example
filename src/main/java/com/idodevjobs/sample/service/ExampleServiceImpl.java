package com.idodevjobs.sample.service;

import com.idodevjobs.sample.model.ExampleModel;
import org.springframework.stereotype.Service;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ExampleModel get(String id) {
        return new ExampleModel("hello world", 1001);
    }

    @Override
    public ExampleModel getServerError(Integer id) {
        return new ExampleModel(id.toString(), 1001);
    }

    @Override
    public ExampleModel getThrowable(Integer id) {
        long[] l = new long[Integer.MAX_VALUE]; //creates out of memory error
        return new ExampleModel(id.toString(), 1001);
    }
}