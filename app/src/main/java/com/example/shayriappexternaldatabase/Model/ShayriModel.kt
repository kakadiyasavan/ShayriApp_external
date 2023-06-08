package com.example.shayriappexternaldatabase.Model

class ShayriModel {

    var id =0
    var cate_id =0
    lateinit var text:String

    constructor(id: Int, cate_id: Int, text: String) {
        this.id = id
        this.cate_id = cate_id
        this.text = text
    }
}