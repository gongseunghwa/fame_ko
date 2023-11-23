package com.sh.fame_ko.exception

import lombok.Getter

@Getter
class NotFoundException : TipException {
    /**
     * 资源找不到的class类
     */
    private var clz: Class<*>? = null

    constructor()
    constructor(clz: Class<*>?) {
        this.clz = clz
    }
}