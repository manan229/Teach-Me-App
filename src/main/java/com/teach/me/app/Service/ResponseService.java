package com.teach.me.app.Service;

import com.teach.me.app.Exception.ResponseNotFoundException;
import com.teach.me.app.Model.Response;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ResponseService {
    /**
     *
     * @param response
     */
    public Response insertResponse(Response response);

    /**
     *
     * @return
     */
    public List<Response> getAllResponses();

    /**
     *
     * @param id
     * @return
     */
    public Response getResponseById(int id) throws ResponseNotFoundException;
}
