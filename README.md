# DUDE AI — Foundation v1

This is the first real application foundation, not a simulated AI chatbot.

## Included
- Responsive mobile-first interface
- PWA manifest and service worker for app-shell caching
- Local to-do list
- Local notes
- JSON backup export
- Personal coach reflection prompts
- Clear AI connection status (no fake generated answers)

## Important limitations
- The real AI model is NOT connected yet. The chat is intentionally disabled until a genuine model runtime/backend is configured.
- Notes and tasks are stored in this browser on this device. They are not cloud-synced.
- Browser notifications, voice, authentication, cloud sync and AI model integration are future modules.
- No API keys or secrets belong in this public repository.

## Deploy
GitHub repository → Settings → Pages → Deploy from a branch → `main` → `/(root)` → Save.
Wait for the Pages deployment URL, then open it in Chrome.

## Free-first architecture
Keep the static client free. Add an on-device Android model where device/runtime compatibility permits, or an explicitly free-tier remote provider with strict usage limits. Never expose a private API key in client-side JavaScript or a public repository.

## Testing before each release
Test navigation, local save/reload, task completion/deletion, note deletion, backup export, offline reload, and mobile viewport. Do not claim 100% crash-free; use incremental releases and recovery tests.
