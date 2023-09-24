package com.raredev.vcspace.editor.completion;

import com.raredev.vcspace.editor.language.html.completion.HtmlCompletionProvider;
import com.raredev.vcspace.editor.language.java.completion.JavaCompletionProvider;
import com.raredev.vcspace.editor.language.kotlin.completion.KotlinCompletionProvider;
import com.raredev.vcspace.editor.language.lua.completion.LuaCompletionProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CompletionProvider {

  private static final Map<Class<?>, CompletionProvider> providers = new HashMap<>();

  public abstract List<VCSpaceCompletionItem> getCompletions(CompletionParams params);

  public static void registerCompletionProviders() {
    providers.put(HtmlCompletionProvider.class, new HtmlCompletionProvider());
    providers.put(JavaCompletionProvider.class, new JavaCompletionProvider());
    providers.put(KotlinCompletionProvider.class, new KotlinCompletionProvider());
    providers.put(LuaCompletionProvider.class, new LuaCompletionProvider());
  }

  public static CompletionProvider getCompletionProvider(Class<?> clss) {
    return providers.get(clss);
  }
}
