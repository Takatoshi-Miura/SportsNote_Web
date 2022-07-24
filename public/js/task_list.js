var TASK_L = {};

// 文字列定義 
TASK_L.title = ""; 
TASK_L.description = "課題解決型アプリSportsNote(Web版)の課題一覧ページです。";

// 初期化 
TASK_L.init = function() {
    // ページ情報設定
    TASK_L.title = "課題一覧｜" + COM.appName;
    document.title = TASK_L.title;
    document.querySelector('meta[name="description"]').setAttribute("content", TASK_L.description);
    document.querySelector('meta[property="og:title"]').setAttribute("content", TASK_L.title);
    document.querySelector('meta[property="og:description"]').setAttribute("content", TASK_L.description);
    document.querySelector('meta[property="og:type"]').setAttribute("content", "website");
    document.querySelector('meta[property="og:url"]').setAttribute("content", "");
    document.querySelector('meta[property="og:image"]').setAttribute("content", COM.appImagePath);
    document.querySelector('meta[property="og:site_name"]').setAttribute("content", COM.appName);

    // 処理
    
};