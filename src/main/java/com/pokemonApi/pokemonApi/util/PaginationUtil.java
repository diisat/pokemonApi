package com.pokemonApi.pokemonApi.util;

import java.util.ArrayList;
import java.util.List;

public class PaginationUtil {

    public static <T> List<T> paginate(List<T> items, int limit, int offset) {
        int startIndex = offset;
        int endIndex = Math.min(offset + limit, items.size());
        if (startIndex >= items.size()) {
            return new ArrayList<>();
        }
        return items.subList(startIndex, endIndex);
    }

}
