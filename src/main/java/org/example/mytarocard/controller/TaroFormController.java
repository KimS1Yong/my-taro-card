package org.example.mytarocard.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.UUID;

@WebServlet("/")
public class TaroFormController extends Controller {
    @Override
    public void init() throws ServletException {
        log("TaroFormControllerInit");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log("TaroFormControllerDoGet");
        req.setAttribute("pageTitle", "타로 카드 좋아!");
        req.setAttribute("ogTitle", "5살 때부터 타로를 봤어~");
        req.setAttribute("ogDescription", "영재의 타로 봐주기");
        req.setAttribute("ogImageUrl", "%s/assets/%s".formatted(req.getContextPath(), "taro.png"));
        req.setAttribute("ogPageUrl", req.getContextPath());

        view(req, resp, "form");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 무언가 처리할 예정

        // 겹칠 확률이 극도로 낮은 임의의 문자열 값
        String uuid = UUID.randomUUID().toString();
        // 새로운 호출을 처리하기

        resp.sendRedirect(req.getContextPath() + "/result/%s".formatted(uuid));
    }
}
