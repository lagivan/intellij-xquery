/*
 * Copyright 2013 Grzegorz Ligas <ligasgr@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.xquery.util;

/**
 * Created with IntelliJ IDEA.
 * User: ligasgr
 * Date: 08/09/13
 * Time: 00:11
 * To change this template use File | Settings | File Templates.
 */
public class StringUtils {
    public static String removeQuotOrApos(String text) {
        return text.substring(1, text.length() - 1);
    }

    public static String compressWhitespaces(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
