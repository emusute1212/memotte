package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new io.github.emusute1212.memotte.android.DataBinderMapperImpl());
  }
}
