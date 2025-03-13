<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <link href="<%= request.getContextPath() %>/assets/form-style.css" rel="stylesheet">
    <title><%= request.getAttribute("pageTitle") %>></title>
    <link href="<%= request.getContextPath() %>/assets/form-style.css" rel="stylesheet">
    <meta property="og:title" content="<%= request.getAttribute("ogTitle") %>" />
    <meta property="og:description" content="<%= request.getAttribute("ogDescription") %>" />
    <meta property="og:image" content="<%= request.getAttribute("ogImageUrl") %>" />
    <meta property="og:url" content="<%= request.getAttribute("ogPageUrl") %>" />
</head>
<body>
    <main>
            <h1>🃏타로카드 결과</h1>
        <section>
            <p><%= request.getAttribute("uuid")%></p>

            <button onclick="location.href = '<%= request.getContextPath() %>'">다시 하기</button>
        </section>
    </main>

</body>
</html>
