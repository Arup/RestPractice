package com.business;

import com.api.TodoService;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

public class TodoBsinessImplMockTest {
    @Test
    public void testRetTodoSPr_usingMock(){
        TodoService todoServiceMock = mock(TodoService.class);
        TodoBusinessImpl impl = new TodoBusinessImpl(todoServiceMock);

        List<String> filteredList = impl.retTodosRelatedToSpr("Dummy");
        Assert.assertEquals(1,filteredList.size());

    }
}
