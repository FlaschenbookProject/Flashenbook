package com.book.flaschenbook.model;

import java.math.BigDecimal;
import java.util.Date;

public class BookInfoModel {

    private String isbn;
    private String title;
    private Integer categoryId;
    private String author;
    private String translator;
    private String publisher;
    private Date pubDate;
    private BigDecimal price;
    private Integer pageCnt;
    private String imageUrl;
    private String ranking;

    private String naverDescription;
    private String aladinDescription;
    private String kakaoDescription;

    private String aladinSaleUrl;
    private String naverSaleUrl;
    private String kakaoSaleUrl;

    private Integer aladin_salePrice;
    private Integer naver_salePrice;
    private Integer kakao_salePrice;

    private String aladin_saleStatus;
    private String naver_saleStatus;
    private String kakao_saleStatus;
}