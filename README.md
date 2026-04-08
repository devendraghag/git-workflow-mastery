# Git Workflow Mastery

A practical, beginner-friendly Git reference repository that explains core Git commands with simple language, realistic examples, and safe usage tips.

## Who this is for

This repository is for:
- Beginners learning Git from scratch
- Students preparing for interviews
- Developers who want quick command refreshers
- Teams standardizing everyday Git workflows

## What you'll find

Each `git_*.text` file focuses on one command and follows a consistent style:
- What the command does
- Why/when to use it
- Syntax and common options
- Step-by-step examples
- Important warnings and best practices
- Quick summary

## Command Index

### Core basics
- `git_init.text` — initialize a repository
- `git_clone.text` — copy an existing repository
- `git_status.text` — inspect working tree state
- `git_add.text` — stage changes
- `git_commit` *(covered partly in command guides; dedicated file can be added)*
- `git_push.text` — send commits to remote
- `git_pull.text` — fetch + merge from remote
- `git_fetch.text` — download remote updates without merging

### Branching and navigation
- `git_branch.text` — create/list/delete branches
- `git_checkout.text` — switch branches/restore states
- `git_HEAD.text` — understand HEAD and detached HEAD
- `git_stash.text` — temporarily save uncommitted work

### History and recovery
- `git_revert.text` — undo via new commit
- `git_reset.text` — rewrite local history *(currently to be completed)*
- `git_ammend.text` — amend last commit *(filename typo kept for compatibility; see roadmap)*
- `git_cherryPick.text` — apply specific commit from another branch
- `git_tag.text` — label important commits/releases
- `git_prune.text` — clean unreachable Git objects
- `git_clean.text` — remove untracked files *(currently to be completed)*

## Suggested Learning Path

If you are new to Git, follow this order:

1. `git_init` / `git_clone`
2. `git_status`
3. `git_add`
4. commit flow
5. `git_branch` + `git_checkout`
6. `git_fetch` + `git_pull` + `git_push`
7. `git_stash`
8. `git_revert` + `git_reset`
9. `git_cherry-pick` + `git_tag`
10. cleanup (`git_clean`, `git_prune`)

## Current Gaps / Roadmap

Planned improvements:
- Fill missing content in:
  - `git_clean.text`
  - `git_reset.text`
- Rename `git_ammend.text` to `git_amend.text` (with compatibility note)
- Add a dedicated `git_commit` guide
- Add mini hands-on labs in an `examples/` folder
- Add quick cheat sheet in Markdown format

## How to use this repository

- Open the file for the command you need.
- Read the “IMPORTANT” section before running destructive commands.
- Try examples in a test repository first.
- Prefer safe preview options (`--dry-run`, `--soft`, etc.) where applicable.

## Contributing

Please read [CONTRIBUTING.md](./CONTRIBUTING.md) before submitting changes.

By contributing, you agree to follow our [Code of Conduct](./CODE_OF_CONDUCT.md).

## License

This project is licensed under the MIT License. See [LICENSE](./LICENSE).
