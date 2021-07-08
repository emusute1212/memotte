package io.github.emusute1212.memotte.data.domain

fun MemoLocalDbEntity.toMemoEntity(): MemoEntity {
    return MemoEntity(
        id = id,
        content = content,
        createOn = createOn,
    )
}

fun MemoEntity.toMemoLocalDbEntity(): MemoLocalDbEntity {
    return MemoLocalDbEntity(
        id = id,
        content = content,
        createOn = createOn,
    )
}