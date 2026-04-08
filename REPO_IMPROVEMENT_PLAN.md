# Repo Improvement Plan (Actionable)

This document gives a practical upgrade plan for `git-workflow-mastery` so the repository looks stronger for learners and recruiters.

## 1) Quick wins (same day)

- Rename legacy files for consistency:
  - `git_cheeryPick.text` → `git_cherry_pick.text`
  - `git_HEAD.text` → `git_head.text`
- Keep temporary compatibility notes in `README.md` after rename.
- Add a short "Start Here" section at the top of `README.md` linking to the suggested learning path.

## 2) High-impact content upgrades (1-3 days)

- Add `examples/` with practical labs:
  1. accidental commit on wrong branch
  2. recovering from `git reset --hard` using `git reflog`
  3. safe cleanup with `git clean --dry-run`
- Add one-page `CHEATSHEET.md` with common command combos.
- Add "Common mistakes" and "How to recover" at the end of risky command guides:
  - `git_reset.text`
  - `git_clean.text`
  - `git_rebase.text`

## 3) Portfolio quality upgrades (this week)

- Add simple release milestones:
  - `v1.0` (core docs complete)
  - `v1.1` (labs + cheat sheet)
  - `v1.2` (visual diagrams + quizzes)
- Add repository topics on GitHub:
  - `git`, `version-control`, `git-tutorial`, `beginner-friendly`, `developer-education`
- Pin this project on your profile with a short value statement.

## 4) Consistency checklist (for every doc PR)

- File names in README exactly match repository files.
- Every command guide includes:
  - what it does
  - when to use it
  - one real example
  - safety warnings (if destructive)
- No contradictory advice across command files.
- Spelling/grammar reviewed before merge.

## Suggested execution order

1. Filename cleanup PR (small and focused)
2. Labs + cheat sheet PR
3. Diagrams + quiz PR
4. Release/tag and profile pin update
